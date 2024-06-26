package de.saschat.createcomputing.behaviour.source;

import com.simibubi.create.content.redstone.displayLink.DisplayLinkContext;
import com.simibubi.create.content.redstone.displayLink.source.DisplaySource;
import com.simibubi.create.content.redstone.displayLink.target.DisplayTargetStats;
import de.saschat.createcomputing.tiles.ComputerizedDisplaySourceTile;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;

import java.util.List;

public class TextDisplayBehaviour extends DisplaySource {
    public static MutableComponent NIL_TEXT = Component.literal("");
    @Override
    public List<MutableComponent> provideText(DisplayLinkContext displayLinkContext, DisplayTargetStats displayTargetStats) {
        /*
            Maybe some events in the future?
         */
        return ((ComputerizedDisplaySourceTile) displayLinkContext.getSourceBlockEntity()).getFromPos(displayLinkContext.blockEntity().getBlockPos()).toDisplay;
    }

    @Override
    public int getPassiveRefreshTicks() {
        return 20;
    }
}
