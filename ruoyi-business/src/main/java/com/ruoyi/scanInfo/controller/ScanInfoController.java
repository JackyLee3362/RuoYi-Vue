package com.ruoyi.scanInfo.controller;

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
import com.ruoyi.scanInfo.domain.ScanInfo;
import com.ruoyi.scanInfo.service.IScanInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 随申码Controller
 * 
 * @author ruoyi
 * @date 2024-10-15
 */
@RestController
@RequestMapping("/scanInfo/scanInfo")
public class ScanInfoController extends BaseController
{
    @Autowired
    private IScanInfoService scanInfoService;

    /**
     * 查询随申码列表
     */
    @PreAuthorize("@ss.hasPermi('scanInfo:scanInfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(ScanInfo scanInfo)
    {
        startPage();
        List<ScanInfo> list = scanInfoService.selectScanInfoList(scanInfo);
        return getDataTable(list);
    }

    /**
     * 导出随申码列表
     */
    @PreAuthorize("@ss.hasPermi('scanInfo:scanInfo:export')")
    @Log(title = "随申码", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ScanInfo scanInfo)
    {
        List<ScanInfo> list = scanInfoService.selectScanInfoList(scanInfo);
        ExcelUtil<ScanInfo> util = new ExcelUtil<ScanInfo>(ScanInfo.class);
        util.exportExcel(response, list, "随申码数据");
    }

    /**
     * 获取随申码详细信息
     */
    @PreAuthorize("@ss.hasPermi('scanInfo:scanInfo:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(scanInfoService.selectScanInfoById(id));
    }

    /**
     * 新增随申码
     */
    @PreAuthorize("@ss.hasPermi('scanInfo:scanInfo:add')")
    @Log(title = "随申码", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ScanInfo scanInfo)
    {
        return toAjax(scanInfoService.insertScanInfo(scanInfo));
    }

    /**
     * 修改随申码
     */
    @PreAuthorize("@ss.hasPermi('scanInfo:scanInfo:edit')")
    @Log(title = "随申码", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ScanInfo scanInfo)
    {
        return toAjax(scanInfoService.updateScanInfo(scanInfo));
    }

    /**
     * 删除随申码
     */
    @PreAuthorize("@ss.hasPermi('scanInfo:scanInfo:remove')")
    @Log(title = "随申码", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(scanInfoService.deleteScanInfoByIds(ids));
    }
}
