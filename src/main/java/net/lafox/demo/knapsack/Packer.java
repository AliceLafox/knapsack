package net.lafox.demo.knapsack;

import java.nio.file.Paths;
import java.util.List;

import net.lafox.demo.knapsack.dto.IncomingDto;
import net.lafox.demo.knapsack.dto.Knapsack;
import net.lafox.demo.knapsack.exception.APIException;
import net.lafox.demo.knapsack.utils.FileReader;
import net.lafox.demo.knapsack.utils.OutputFormatter;

public class Packer {

    public static String pack(String absolutePath) {
        ProblemResolver problemResolver = new ProblemResolverNaiveBruteForceImpl();
        List<IncomingDto> incomingPackageData = FileReader.readFile(Paths.get(absolutePath));

        StringBuilder sb = new StringBuilder();

        for (IncomingDto packageData : incomingPackageData) {
            Knapsack knapsack = problemResolver.resolve(packageData);
            sb.append(OutputFormatter.format(knapsack.getPackedItems())).append('\n');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            throw new APIException("No absolute path of data file provided");
        }
        System.out.println(pack(args[0]));
    }
}
