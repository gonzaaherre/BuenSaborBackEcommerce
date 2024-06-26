package com.entidades.buenSabor.business.service;

import com.entidades.buenSabor.business.service.Base.BaseService;
import com.entidades.buenSabor.domain.dto.Articulo.CardArticulo;
import com.entidades.buenSabor.domain.entities.ArticuloInsumo;
import com.entidades.buenSabor.domain.entities.ImagenArticulo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface ArticuloInsumoService extends BaseService<ArticuloInsumo, Long> {

    public List<ArticuloInsumo> getAllHabilitados();
    //Imagenes
    // Método para obtener todas las imágenes almacenadas
    ResponseEntity<List<Map<String, Object>>> getAllImagesByArticuloId(Long id);

    void decrementStock(Long articuloInsumoId, Integer cantidad);

    List<ArticuloInsumo> findBySucursalId(Long sucursalId);
}
