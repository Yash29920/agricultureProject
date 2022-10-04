package com.financeCompany.agri.project.appRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.financeCompany.agri.project.appDto.SanctionLetterDto;

@Repository
public interface SanctionLetterRepository extends JpaRepository<SanctionLetterDto, Integer> {

}
