package com.gildedrose;

public class AbstractItem extends Item {
    public int limit = 50;

    public AbstractItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality() {
        if (super.sellIn < 0) {
            quality -= 1;
        }
        if (super.quality > 0) {
            quality -= 1;
        }
    }
    public void updateSellIn() {
        sellIn -= 1;
    }
}
