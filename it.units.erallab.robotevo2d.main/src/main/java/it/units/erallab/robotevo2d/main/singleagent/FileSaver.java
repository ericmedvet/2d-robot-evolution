package it.units.erallab.robotevo2d.main.singleagent;

import it.units.erallab.mrsim2d.builder.Param;

import java.util.function.Function;

/**
 * @author "Eric Medvet" on 2022/09/01 for 2d-robot-evolution
 */
public record FileSaver<Q>(
    @Param("fileName") String fileName,
    @Param("serializer") Function<? super Q, String> serializer
) {}
