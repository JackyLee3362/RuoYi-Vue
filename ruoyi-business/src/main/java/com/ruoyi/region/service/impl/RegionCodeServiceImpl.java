package com.ruoyi.region.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.region.mapper.RegionCodeMapper;
import com.ruoyi.region.domain.RegionCode;
import com.ruoyi.region.service.IRegionCodeService;

/**
 * 行政区域Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-15
 */
@Service
public class RegionCodeServiceImpl implements IRegionCodeService 
{
    @Autowired
    private RegionCodeMapper regionCodeMapper;

    /**
     * 查询行政区域
     * 
     * @param id 行政区域主键
     * @return 行政区域
     */
    @Override
    public RegionCode selectRegionCodeById(Long id)
    {
        return regionCodeMapper.selectRegionCodeById(id);
    }

    /**
     * 查询行政区域列表
     * 
     * @param regionCode 行政区域
     * @return 行政区域
     */
    @Override
    public List<RegionCode> selectRegionCodeList(RegionCode regionCode)
    {
        return regionCodeMapper.selectRegionCodeList(regionCode);
    }

    /**
     * 新增行政区域
     * 
     * @param regionCode 行政区域
     * @return 结果
     */
    @Override
    public int insertRegionCode(RegionCode regionCode)
    {
        return regionCodeMapper.insertRegionCode(regionCode);
    }

    /**
     * 修改行政区域
     * 
     * @param regionCode 行政区域
     * @return 结果
     */
    @Override
    public int updateRegionCode(RegionCode regionCode)
    {
        return regionCodeMapper.updateRegionCode(regionCode);
    }

    /**
     * 批量删除行政区域
     * 
     * @param ids 需要删除的行政区域主键
     * @return 结果
     */
    @Override
    public int deleteRegionCodeByIds(Long[] ids)
    {
        return regionCodeMapper.deleteRegionCodeByIds(ids);
    }

    /**
     * 删除行政区域信息
     * 
     * @param id 行政区域主键
     * @return 结果
     */
    @Override
    public int deleteRegionCodeById(Long id)
    {
        return regionCodeMapper.deleteRegionCodeById(id);
    }
}
