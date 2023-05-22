package com.gildedrose;

public class Conjured extends AbstractItem {
    public Conjured(Item item){
        super(item.name, item.sellIn, item.quality);
    }

    @Override
    public void updateQuality() {
            quality -= 2;
    }

    @Override
    public void updateSellIn() {
        super.updateSellIn();
    }
}
