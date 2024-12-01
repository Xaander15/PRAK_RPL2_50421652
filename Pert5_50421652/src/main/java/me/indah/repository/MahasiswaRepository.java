package me.indah.repository;

import me.indah.model.ModelMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author mahab
 */
@Repository
public interface MahasiswaRepository extends JpaRepository<ModelMahasiswa, Long> {
    
}
