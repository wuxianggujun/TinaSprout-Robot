package com.wuxianggujun.tinasproutrobot.command.impl;

import com.wuxianggujun.tinasproutrobot.command.CommandArgs;
import com.wuxianggujun.tinasproutrobot.command.inter.Command;
import com.wuxianggujun.tinasproutrobot.command.inter.CommandFactory;
import org.springframework.stereotype.Component;

/**
 * @author WuXiangGuJun
 * @create 2023-02-25 23:14
 **/
@Component("add")
public class AddCommandFactory implements CommandFactory {

    @Override
    public Command createCommand(CommandArgs args) {
        if (args.equalsKey("admin")) {
            return new AddAdminCommand();
        }
        return new AddCommand();
    }

    @Override
    public String getCommandName() {
        return this.getClass().getSimpleName();
    }
}
