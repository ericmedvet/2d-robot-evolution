/*
 * Copyright 2022 eric
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package it.units.erallab.robotevo2d.main;

import io.github.ericmedvet.jgea.experimenter.InvertibleMapper;
import io.github.ericmedvet.jnb.core.Param;
import io.github.ericmedvet.mrsim2d.core.engine.Engine;
import io.github.ericmedvet.mrsim2d.core.tasks.Task;
import io.github.ericmedvet.mrsim2d.viewer.Drawer;
import io.github.ericmedvet.mrsim2d.viewer.VideoUtils;
import it.units.erallab.robotevo2d.main.builders.Misc;

import java.util.function.Function;
import java.util.function.Supplier;

public record Play<G, S, O>(
    @Param("name") String name,
    @Param(value = "genotype", dNPM = "ea.f.identity()") Function<G, G> genotype,
    @Param("mapper") InvertibleMapper<G, S> mapper,
    @Param("task") Task<S, O> task,
    @Param(value = "drawer", dNPM = "sim.drawer()") Function<String, Drawer> drawer,
    @Param(value = "w", dI = Misc.FILE_VIDEO_W) int w,
    @Param(value = "h", dI = Misc.FILE_VIDEO_H) int h,
    @Param(value = "frameRate", dD = 30) double frameRate,
    @Param(value = "startTime", dD = 0) double startTime,
    @Param(value = "endTime", dD = 30) double endTime,
    @Param(value = "codec", dS = "jcodec") VideoUtils.EncoderFacility codec,
    @Param(value = "engine", dNPM = "sim.engine()") Supplier<Engine> engineSupplier,
    @Param("videoFilePath") String videoFilePath
) {


}
