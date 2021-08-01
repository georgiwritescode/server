package server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.domain.Info;

@Repository
public interface InfoMessageRepository extends JpaRepository<Info, Long> {
}
