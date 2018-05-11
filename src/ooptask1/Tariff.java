package ooptask1;

import java.util.Objects;

public class Tariff {
    private int costPerMinInternal;
    private int costPerMinExternal;
    private int costPerMb;
    private int costPerSMS;
    private Integer subCount=100;
    private String name;

    public Tariff() {
    }

    public int getCostPerMinInternal() {
        return costPerMinInternal;
    }

    public void setCostPerMinInternal(int costPerMinInternal) {
        this.costPerMinInternal = costPerMinInternal;
    }

    public int getCostPerMinExternal() {
        return costPerMinExternal;
    }

    public void setCostPerMinExternal(int costPerMinExternal) {
        this.costPerMinExternal = costPerMinExternal;
    }

    public int getCostPerMb() {
        return costPerMb;
    }

    public void setCostPerMb(int costPerMb) {
        this.costPerMb = costPerMb;
    }

    public int getCostPerSMS() {
        return costPerSMS;
    }

    public void setCostPerSMS(int costPerSMS) {
        this.costPerSMS = costPerSMS;
    }
    public int getSubCount() {
        return subCount;
    }

    public void setSubCount(int subCount) {
        this.subCount = subCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tariff tariff = (Tariff) o;
        return costPerMinInternal == tariff.costPerMinInternal &&
                costPerMinExternal == tariff.costPerMinExternal &&
                costPerMb == tariff.costPerMb &&
                costPerSMS == tariff.costPerSMS &&
                Objects.equals(subCount, tariff.subCount) &&
                Objects.equals(name, tariff.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(costPerMinInternal, costPerMinExternal, costPerMb, costPerSMS, subCount, name);
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "costPerMinInternal=" + costPerMinInternal +
                ", costPerMinExternal=" + costPerMinExternal +
                ", costPerMb=" + costPerMb +
                ", costPerSMS=" + costPerSMS +
                ", subCount=" + subCount +
                ", name='" + name + '\'' +
                '}';
    }
}
