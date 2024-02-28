package com.example.money2.repositories;

import com.example.money2.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;



public interface NotificationRepository extends JpaRepository<Notification,Long> {
}
