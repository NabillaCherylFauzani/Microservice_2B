package nabilla.pelanggan.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nabilla.pelanggan.model.pelanggan;

@Repository
public interface PelangganRespository extends JpaRepository<pelanggan, Long> {

}