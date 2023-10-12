package cosas;// Created by jhant on 12/10/2023.

import lombok.*;

@RequiredArgsConstructor @AllArgsConstructor @ToString
public class Persona
{
    @Getter
    private final String nombre;
    @Getter
    private final String dni;

    @Getter @Setter
    private Persona padre;
    @Getter @Setter
    private Persona madre;
}