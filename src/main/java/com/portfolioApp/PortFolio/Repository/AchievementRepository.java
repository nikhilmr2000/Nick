package com.portfolioApp.PortFolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolioApp.PortFolio.Entity.Acheievements;

@Repository
public interface AchievementRepository extends JpaRepository<Acheievements,Long>{

}
