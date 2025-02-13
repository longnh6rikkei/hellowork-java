package com.systena.aghcloud.service.base;

import com.systena.aghcloud.repository.BaseRepository;

import java.util.List;

public class BaseServiceImpl<T> implements BaseService<T> {
  private final BaseRepository<T> repository;

  public BaseServiceImpl(BaseRepository<T> repository) {
    this.repository = repository;
  }

  @Override
  public T create(T t) {
    return repository.save(t);
  }

  @Override
  public T update(T t) {
    return repository.save(t);
  }

  @Override
  public void delete(String id) {repository.deleteById(id);}

  @Override
  public T get(String id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public List<T> list() {return repository.findAll();}
}
