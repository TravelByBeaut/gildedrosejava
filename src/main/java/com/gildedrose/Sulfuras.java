package com.gildedrose;

public class Sulfuras extends AbstractItem {


    public Sulfuras(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public void updateQuality() {
        // no action
    }

    @Override
    public void updateSellIn() {
        // no action
    }
}
