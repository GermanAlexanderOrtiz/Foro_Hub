package com.naok.forohub.domain.respuesta.validaciones.actualizar;

import com.naok.forohub.domain.respuesta.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    public void validate(ActualizarRespuestaDTO data, Long respuestaId);

}
