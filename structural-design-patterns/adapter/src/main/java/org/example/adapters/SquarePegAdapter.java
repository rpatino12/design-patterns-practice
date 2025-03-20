package org.example.adapters;

import org.example.round.RoundPeg;
import org.example.square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    // The adapter pretends that it's a round peg with a
    // radius that could fit the square peg that the adapter
    // actually wraps.
    @Override
    public double getRadius() {
        // Calculate a minimum circle radius, which can fit this peg.
        return Math.sqrt(2) * (this.peg.getWidth() / 2);
    }
}
