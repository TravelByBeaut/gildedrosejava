package com.gildedrose;

public class Brie extends AbstractItem {

    public Brie(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public void updateQuality() {
        quality = quality + 1;
        if (super.sellIn < 0) {
            quality += 1;
        }
    }

    @Override
    public void updateSellIn() {
        super.updateSellIn();
    }
}
