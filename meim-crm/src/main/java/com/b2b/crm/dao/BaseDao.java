package com.b2b.crm.dao;


import java.io.Serializable;
import java.util.List;

import com.b2b.crm.dao.mapper.BaseMapper;
import com.b2b.crm.model.BaseModel;

public abstract class BaseDao<T extends BaseModel> {

    protected abstract BaseMapper<T> getMapper();

    public T get(Long id) {
        return getMapper().get(id);
    }

    public List<T> find() {
        return getMapper().find();
    }

    public List<T> findByIds(List<Serializable> ids) {
        return getMapper().findByIds(ids);
    }

    public T insert(T model) {
        getMapper().insert(model);
        return model;
    }

    public void batchInsert(List<T> models) {
        getMapper().batchInsert(models);
    }

    //更新乐观锁
    public void update(T model) {
        int updatedCount = getMapper().update(model);
        if (updatedCount == 0) {
            throw new RuntimeException("更新失败");
        }
    }

    public void batchUpdate(List<T> models) {
        for (T model : models) {
            update(model);
        }
    }

    public void delete(Long id) {
        getMapper().delete(id);
    }

    public void delete(T model) {
        getMapper().delete(model);
    }

    public void batchDelete(List<T> models) {
        getMapper().batchDelete(models);
    }

}
