package com.nb.mapper;

import com.nb.entity.Businessman;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author TanQingshan
 */
@Repository
public interface BusinessmanMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Businessman record);

    Businessman selectByPrimaryKey(Long id);

    List<Businessman> selectAll();

    int updateByPrimaryKey(Businessman record);
}