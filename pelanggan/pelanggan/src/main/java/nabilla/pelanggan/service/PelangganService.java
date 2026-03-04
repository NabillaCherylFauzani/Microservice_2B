package nabilla.pelanggan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nabilla.pelanggan.model.pelanggan;
import nabilla.pelanggan.respository.PelangganRespository;

@Service
public class PelangganService {

    @Autowired
    private PelangganRespository pelangganRepository;

    public List<pelanggan> getAllPelanggans() {
        return pelangganRepository.findAll();
    }

    public pelanggan getPelangganById(Long id) {
        return pelangganRepository.findById(id).orElse(null);
    }

    public pelanggan createPelanggan(pelanggan pelanggan) {
        return pelangganRepository.save(pelanggan);
    }

    public void deletePelanggan(Long id) {
        pelangganRepository.deleteById(id);
    }
}