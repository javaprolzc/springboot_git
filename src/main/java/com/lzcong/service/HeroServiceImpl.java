package com.lzcong.service;

import com.lzcong.domain.TbHero;
import com.lzcong.mapper.HeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HeroServiceImpl implements HeroService{

    @Autowired
    private HeroMapper heroMapper;

    @Override
    public List<TbHero> getAll() {
        List<TbHero> all = heroMapper.getAll();
        List<TbHero> tbHeroes = heroMapper.selectAll();
        for (TbHero tbHero : tbHeroes) {
            System.out.println(tbHero);
        }
        System.out.println("************************");
        return all;
    }
}
