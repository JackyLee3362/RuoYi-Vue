package com.ruoyi.region.mapper;

import java.util.List;
import com.ruoyi.region.domain.RegionCode;

/**
 * 行政区域Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-15
 */
public interface RegionCodeMapper 
{
    /**
     * 查询行政区域
     * 
     * @param id 行政区域主键
     * @return 行政区域
     */
    public RegionCode selectRegionCodeById(Long id);

    /**
     * 查询行政区域列表
     * 
     * @param regionCode 行政区域
     * @return 行政区域集合
     */
    public List<RegionCode> selectRegionCodeList(RegionCode regionCode);

    /**
     * 新增行政区域
     * 
     * @param regionCode 行政区域
     * @return 结果
     */
    public int insertRegionCode(RegionCode regionCode);

    /**
     * 修改行政区域
     * 
     * @param regionCode 行政区域
     * @return 结果
     */
    public int updateRegionCode(RegionCode regionCode);

    /**
     * 删除行政区域
     * 
     * @param id 行政区域主键
     * @return 结果
     */
    public int deleteRegionCodeById(Long id);

    /**
     * 批量删除行政区域
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRegionCodeByIds(Long[] ids);
}
