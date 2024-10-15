package com.ruoyi.scanInfo.service.impl;

import com.ruoyi.scanInfo.constant.ScanInfoConstants;
import com.ruoyi.scanInfo.domain.ScanInfo;
import com.ruoyi.scanInfo.exception.BusinessException;
import com.ruoyi.scanInfo.mapper.ScanInfoMapper;
import com.ruoyi.scanInfo.service.IScanInfoService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 随申码Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-15
 */
@Service
public class ScanInfoServiceImpl implements IScanInfoService 
{
    @Resource
    private ScanInfoMapper scanInfoMapper;

    /**
     * 查询随申码
     * 
     * @param id 随申码主键
     * @return 随申码
     */
    @Override
    public ScanInfo selectScanInfoById(Long id)
    {
        return scanInfoMapper.selectScanInfoById(id);
    }

    /**
     * 查询随申码列表
     * 
     * @param scanInfo 随申码
     * @return 随申码
     */
    @Override
    public List<ScanInfo> selectScanInfoList(ScanInfo scanInfo)
    {
        return scanInfoMapper.selectScanInfoList(scanInfo);
    }

    /**
     * 新增随申码
     * 
     * @param scanInfo 随申码
     * @return 结果
     */
    @Override
    public int insertScanInfo(ScanInfo scanInfo)
    {
        throw new BusinessException(ScanInfoConstants.moduleName, "新增失败");
        // return scanInfoMapper.insertScanInfo(scanInfo);
    }

    /**
     * 修改随申码
     * 
     * @param scanInfo 随申码
     * @return 结果
     */
    @Override
    public int updateScanInfo(ScanInfo scanInfo)
    {
        throw new BusinessException(ScanInfoConstants.moduleName, "修改失败");
        // return scanInfoMapper.updateScanInfo(scanInfo);
    }

    /**
     * 批量删除随申码
     * 
     * @param ids 需要删除的随申码主键
     * @return 结果
     */
    @Override
    public int deleteScanInfoByIds(Long[] ids)
    {
        throw new BusinessException(ScanInfoConstants.moduleName, "删除失败");
        // return scanInfoMapper.deleteScanInfoByIds(ids);
    }

    /**
     * 删除随申码信息
     * 
     * @param id 随申码主键
     * @return 结果
     */
    @Override
    public int deleteScanInfoById(Long id)
    {
        throw new BusinessException(ScanInfoConstants.moduleName, "删除失败");
        // return scanInfoMapper.deleteScanInfoById(id);
    }
}
