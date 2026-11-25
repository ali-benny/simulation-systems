/****************************************************************************
 *
 * RandExp.java - Exponential RNG
 *
 * Copyright (C) 2026 Moreno Marzolla
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 ****************************************************************************/

package jdes;

import java.util.SplittableRandom;
import java.util.Random;

/**
 * Utility class to generate pseudo-random numbers with exponential
 * distribution with rate lambda. Each instance of this class uses of
 * a new random stream produced by the SplittableRandom class.  The
 * "root" RNG is always initialized with the same seed, so each
 * execution of a program will generate the same sequence of random
 * numbers.
 */
public class RandExp {
    static SplittableRandom globalRng = new SplittableRandom(42);
    SplittableRandom rng;
    double lambda;

    /**
     * This RNG will generate a stream of pseudo-random numbers
     * that exponentially distributed with mean (1/lambda).
     */
    public RandExp(double lambda) {
        this.rng = globalRng.split();
        this.lambda = lambda;
    }

    public double nextDouble( ) {
        return Math.log(1-rng.nextDouble())/(-lambda);
    }
}
