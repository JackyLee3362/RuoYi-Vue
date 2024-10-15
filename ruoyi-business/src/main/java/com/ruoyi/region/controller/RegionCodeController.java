package com.ruoyi.region.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.region.domain.RegionCode;
import com.ruoyi.region.service.IRegionCodeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 行政区域Controller
 * 
 * @author ruoyi
 * @date 2024-10-15
 */
@RestController
@RequestMapping("/region/regionCode")
public class RegionCodeController extends BaseController
{
    @Autowired
    private IRegionCodeService regionCodeService;

    /**
     * 查询行政区域列表
     */
    @PreAuthorize("@ss.hasPermi('region:regionCode:list')")
    @GetMapping("/list")
    public TableDataInfo list(RegionCode regionCode)
    {
        startPage();
        List<RegionCode> list = regionCodeService.selectRegionCodeList(regionCode);
        return getDataTable(list);
    }

    /**
     * 导出行政区域列表
     */
    @PreAuthorize("@ss.hasPermi('region:regionCode:export')")
    @Log(title = "行政区域", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RegionCode regionCode)
    {
        List<RegionCode> list = regionCodeService.selectRegionCodeList(regionCode);
        ExcelUtil<RegionCode> util = new ExcelUtil<RegionCode>(RegionCode.class);
        util.exportExcel(response, list, "行政区域数据");
    }

    /**
     * 获取行政区域详细信息
     */
    @PreAuthorize("@ss.hasPermi('region:regionCode:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(regionCodeService.selectRegionCodeById(id));
    }

    /**
     * 新增行政区域
     */
    @PreAuthorize("@ss.hasPermi('region:regionCode:add')")
    @Log(title = "行政区域", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RegionCode regionCode)
    {
        return toAjax(regionCodeService.insertRegionCode(regionCode));
    }

    /**
     * 修改行政区域
     */
    @PreAuthorize("@ss.hasPermi('region:regionCode:edit')")
    @Log(title = "行政区域", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RegionCode regionCode)
    {
        return toAjax(regionCodeService.updateRegionCode(regionCode));
    }

    /**
     * 删除行政区域
     */
    @PreAuthorize("@ss.hasPermi('region:regionCode:remove')")
    @Log(title = "行政区域", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(regionCodeService.deleteRegionCodeByIds(ids));
    }
}
