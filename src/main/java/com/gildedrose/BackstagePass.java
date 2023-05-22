package com.gildedrose;

public class BackstagePass extends AbstractItem {
    public BackstagePass(Item item) {
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public void updateQuality() {
        quality += 1;

        if (super.sellIn < 11) {
            quality += 1;
        }
        if (super.sellIn < 6) {
            quality += 1;
        }
        if (super.quality >= limit) {
            super.quality = limit;
        }
        if (super.sellIn < 0) {
            super.quality = 0;
        }
    }

    @Override
    public void updateSellIn() {
        super.updateSellIn();
    }
}
