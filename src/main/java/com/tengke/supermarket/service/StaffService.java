package com.tengke.supermarket.service;

import com.tengke.supermarket.dto.PageDTO;
import com.tengke.supermarket.dto.StaffDTO;
import com.tengke.supermarket.mapper.StaffMapper;
import com.tengke.supermarket.model.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Mr.Chen
 * @Description:
 * @Date:Created in 6:13 2020/7/28
 */
@Service
public class StaffService {

    @Autowired
    private StaffMapper staffMapper;

    public PageDTO<StaffDTO> getAllStaffByPage(Integer page, Integer size, String search) {
        //��һ��: ��ȡ��Ա������Ȼ���ȡ��ҳ������
        int total = staffMapper.getCount();
        //����ƫ��������ҳ��
        PageDTO<StaffDTO> pageDTO = new PageDTO<>(size, total, page);
        //��װԱ������pageDTO.data
        List<StaffDTO> staffList = staffMapper.getStaffsByPage(pageDTO.getStart(), pageDTO.getPageSize(), search);
        pageDTO.setData(staffList);
        return pageDTO;
    }
}
