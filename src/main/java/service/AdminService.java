package service;

import dto.AdminCreateDto;
import dto.AdminDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created on 10.01.2022. by Andrija inside package service.
 */
public interface AdminService {

    Page<AdminDto> findAll(Pageable pageable);

    AdminDto add(AdminCreateDto adminCreateDto);

    AdminDto findById(Long id);

    void deleteById(Long id);
}