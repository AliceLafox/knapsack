package net.lafox.demo.knapsack;

import net.lafox.demo.knapsack.dto.IncomingDto;
import net.lafox.demo.knapsack.dto.Knapsack;

public interface ProblemResolver {

    Knapsack resolve(IncomingDto data);

}
