package com.peluqueria.peluqueria.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ReservacionListDTO {
    private Long id;
    private String horario;
    private String lugar;
    private String fecha;
    private int cantidadPersona;
}
