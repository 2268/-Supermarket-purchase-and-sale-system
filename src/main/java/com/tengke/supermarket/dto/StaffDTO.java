package com.tengke.supermarket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

/**
 * @Author: Mr.Chen
 * @Description:
 * @Date:Created in 6:14 2020/7/28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffDTO {

    // Ա������
    private String name;

    // �Ա�
    private String gender;

    //���֤��
    @NonNull
    private String idCard;

    // �绰����
    private String phone;

    // ��������
    private String email;

    // ��ϵ��ַ
    private String address;

    // ��ְ״̬
    private String workState;
}
