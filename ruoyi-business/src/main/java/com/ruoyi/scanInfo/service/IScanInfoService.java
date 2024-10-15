package com.ruoyi.scanInfo.service;

import java.util.List;
import com.ruoyi.scanInfo.domain.ScanInfo;

/**
 * 随申码Service接口
 * 
 * @author ruoyi
 * @date 2024-10-15
 */
public interface IScanInfoService 
{
    /**
     * 查询随申码
     * 
     * @param id 随申码主键
     * @return 随申码
     */
    public ScanInfo selectScanInfoById(Long id);

    /**
     * 查询随申码列表
     * 
     * @param scanInfo 随申码
     * @return 随申码集合
     */
    public List<ScanInfo> selectScanInfoList(ScanInfo scanInfo);

    /**
     * 新增随申码
     * 
     * @param scanInfo 随申码
     * @return 结果
     */
    public int insertScanInfo(ScanInfo scanInfo);

    /**
     * 修改随申码
     * 
     * @param scanInfo 随申码
     * @return 结果
     */
    public int updateScanInfo(ScanInfo scanInfo);

    /**
     * 批量删除随申码
     * 
     * @param ids 需要删除的随申码主键集合
     * @return 结果
     */
    public int deleteScanInfoByIds(Long[] ids);

    /**
     * 删除随申码信息
     * 
     * @param id 随申码主键
     * @return 结果
     */
    public int deleteScanInfoById(Long id);
}
