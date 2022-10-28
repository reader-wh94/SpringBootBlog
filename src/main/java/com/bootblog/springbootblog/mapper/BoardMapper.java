package com.bootblog.springbootblog.mapper;

import com.bootblog.springbootblog.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {
    int boardCount();

    List<Board> getList();
}
