package com.tengke.supermarket.dto;

import lombok.Data;
import java.util.List;


/**
 * @author cgs
 */

@Data
public class PageDTO<T> {
    //��ҳ��ѯ�Ľ��
    private List<T> data;
    //��ҳ��
    Integer pagesNum;
    //��¼����
    private Integer recordsNum;

    private Integer start;

    private Integer pageSize;

    public PageDTO(int pageSize, int totalCount, int pageNo) {
        recordsNum = totalCount;
        //�Ϸ����ж�
        if(pageNo <= 0) {
            pageNo = 1;
        }
        if(pageSize <= 0) {
            pageSize = 7;
        }
        //��ȡ��ҳ��
        pagesNum = totalCount % pageSize == 0 ? totalCount  / pageSize : totalCount / pageSize + 1;
        //�жϵ�ǰҳ���Ƿ��ںϷ���Χ��
        if(pageNo > pagesNum) {
            pageNo = pagesNum;
        }
        this.pageSize = pageSize;
        this.start = (pageNo-1) * pageSize;
    }
}