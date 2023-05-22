package com.gildedrose;

public class Normal extends AbstractItem{

    public Normal(Item item) {
        super(item.name, item.sellIn, item.quality);
    }
}
