package de.fhwwedel.pp.util.game.json;

import java.util.Arrays;
import java.util.Objects;

public final class PlayerData {
    private String name;
    private boolean isActive;
    private boolean isAI;
    private int[] hand;

    public PlayerData(String name, boolean isActive, boolean isAI, int[] hand) {
        this.name = name;
        this.isActive = isActive;
        this.isAI = isAI;
        this.hand = hand;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayerData that)) return false;

        if (isActive() != that.isActive()) return false;
        if (isAI() != that.isAI()) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Arrays.equals(hand, that.hand);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (isActive() ? 1 : 0);
        result = 31 * result + (isAI() ? 1 : 0);
        result = 31 * result + Arrays.hashCode(hand);
        return result;
    }

    @Override
    public String toString() {
        return "PlayerData{" +
                "name='" + name + '\'' +
                ", isActive=" + isActive +
                ", isAI=" + isAI +
                ", hand=" + Arrays.toString(hand) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isAI() {
        return isAI;
    }

    public void setAI(boolean ai) {
        isAI = ai;
    }

    public int[] getHand() {
        return hand;
    }

    public void setHand(int[] hand) {
        this.hand = hand;
    }
}
