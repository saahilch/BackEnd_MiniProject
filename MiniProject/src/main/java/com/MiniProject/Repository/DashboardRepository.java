package com.MiniProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MiniProject.Entities.Dashboard;

@Repository
public interface DashboardRepository extends JpaRepository<Dashboard, Long> {

}
