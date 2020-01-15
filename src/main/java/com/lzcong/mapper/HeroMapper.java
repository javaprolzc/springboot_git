package com.lzcong.mapper;

import com.lzcong.domain.TbHero;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface HeroMapper extends Mapper<TbHero> {
    public List<TbHero> getAll();
}
