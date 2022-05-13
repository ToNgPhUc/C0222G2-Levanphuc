package bai_thi_ket_thuc_module.service;

import bai_thi_ket_thuc_module.common.check_try_catch.ThrowException;

public interface InterfaceService<T> {
    void add();
    void delete() throws ThrowException;
    void display();
    void search() throws ThrowException;

}
