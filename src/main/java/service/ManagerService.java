package service;

import dto.ManagerCreateDto;
import dto.ManagerDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created on 10.01.2022. by Andrija inside package service.
 */
public interface ManagerService {

    Page<ManagerDto> findAll(Pageable pageable);

    ManagerDto add(ManagerCreateDto managerCreateDto);

    ManagerDto findById(Long id);

    void deleteById(Long id);
}