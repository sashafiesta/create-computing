package de.saschat.createcomputing.behaviour.target;

import com.simibubi.create.content.redstone.displayLink.DisplayLinkContext;
import com.simibubi.create.content.redstone.displayLink.target.DisplayTarget;
import com.simibubi.create.content.redstone.displayLink.target.DisplayTargetStats;
import de.saschat.createcomputing.tiles.ComputerizedDisplayTargetTile;
import net.minecraft.network.chat.MutableComponent;

import java.util.List;

public class TextPassBehaviour extends DisplayTarget {
    @Override
    public void acceptText(int line, List<MutableComponent> list, DisplayLinkContext displayLinkContext) {
        ComputerizedDisplayTargetTile tile = (ComputerizedDisplayTargetTile) displayLinkContext.getTargetBlockEntity();
        tile.acceptText(line, list, displayLinkContext);
        tile.acceptText(line, list, displayLinkContext);
    }

    @Override
    public DisplayTargetStats provideStats(DisplayLinkContext displayLinkContext) {
        ComputerizedDisplayTargetTile tile = (ComputerizedDisplayTargetTile) displayLinkContext.getTargetBlockEntity();
        return new DisplayTargetStats(tile.maxHeight, tile.maxHeight, this);
    }
}
