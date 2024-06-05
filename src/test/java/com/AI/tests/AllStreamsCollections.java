package com.AI.tests;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import io.reactivex.rxjava3.processors.AsyncProcessor;
 
public class AllStreamsCollections {


	    public void processStockData(List<String> stockData) {
	        // Convert the stock data to a map for processing
	        Map<String, Double> data = extractTableData(stockData);

	        // forEach
	        data.forEach((company, price) -> System.out.println(company + ": " + price));

	        // filter
	        Map<String, Double> filteredData = data.entrySet().stream()
	                .filter(entry -> entry.getValue() > 1000)
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	        System.out.println("Filtered Data: " + filteredData);

	        // findFirst
	        Optional<Map.Entry<String, Double>> firstEntry = data.entrySet().stream().findFirst();
	        System.out.println("First Entry: " + (firstEntry.isPresent() ? firstEntry.get() : "No data found"));

	        // map
	        List<String> companyNames = data.keySet().stream().map(String::toUpperCase).collect(Collectors.toList());
	        System.out.println("Company Names: " + companyNames);

	        // flatMap
	        List<Character> characters = data.keySet().stream()
	                .flatMapToInt(CharSequence::chars)
	                .mapToObj(ch -> (char) ch)
	                .collect(Collectors.toList());
	        System.out.println("Characters: " + characters);

	        // reduce
	        double totalPrice = data.values().stream().reduce(0.0, Double::sum);
	        System.out.println("Total Price: " + totalPrice);

	        // mapToInt
	        int totalNameLength = data.keySet().stream().mapToInt(String::length).sum();
	        System.out.println("Total Name Length: " + totalNameLength);

	        // mapToDouble
	        List<Double> doubledPrices = data.values().stream().map(price -> price * 2).collect(Collectors.toList());
	        System.out.println("Doubled Prices: " + doubledPrices);

	        // mapToLong
	        List<Long> longPrices = data.values().stream().map(Double::longValue).collect(Collectors.toList());
	        System.out.println("Long Prices: " + longPrices);

	        // peek
	        List<Map.Entry<String, Double>> peekedData = data.entrySet().stream()
	                .peek(entry -> System.out.println("Before filtering: " + entry.getKey()))
	                .filter(entry -> entry.getValue() > 500)
	                .collect(Collectors.toList());
	        System.out.println("Peeked Data: " + peekedData);

	        // toArray
	        String[] companyArray = data.keySet().toArray(new String[0]);
	        System.out.println("Company Array: " + Arrays.toString(companyArray));

	        // toList
	        List<Double> priceList = data.values().stream().collect(Collectors.toList());
	        System.out.println("Price List: " + priceList);

	        // allMatch
	        boolean allPricesAbove50 = data.values().stream().allMatch(price -> price > 50);
	        System.out.println("All prices above 50: " + allPricesAbove50);

	        // anyMatch
	        boolean anyPriceAbove2000 = data.values().stream().anyMatch(price -> price > 2000);
	        System.out.println("Any price above 2000: " + anyPriceAbove2000);

	        // noneMatch
	        boolean noNegativePrices = data.values().stream().noneMatch(price -> price < 0);
	        System.out.println("No negative prices: " + noNegativePrices);

	        // sorted
	        List<Double> sortedPrices = data.values().stream().sorted().collect(Collectors.toList());
	        System.out.println("Sorted Prices: " + sortedPrices);

	        // distinct
	        List<Double> uniquePrices = data.values().stream().distinct().collect(Collectors.toList());
	        System.out.println("Unique Prices: " + uniquePrices);

	        // skip and limit
	        Map<String, Double> skippedAndLimitedData = data.entrySet().stream()
	                .skip(2)
	                .limit(5)
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	        System.out.println("Skipped and Limited Data: " + skippedAndLimitedData);

	        // count
	        long totalEntries = data.size();
	        System.out.println("Total Entries: " + totalEntries);

	        // averagingDouble
	        double averagePrice = data.values().stream().collect(Collectors.averagingDouble(Double::doubleValue));
	        System.out.println("Average Price: " + averagePrice);

	        // Other operations can be added similarly
	    }

	    // Method to extract table data from a list of strings and convert it to a map
	    private Map<String, Double> extractTableData(List<String> lines) {
	        Map<String, Double> data = new HashMap<>();
	        for (String line : lines) {
	            String[] parts = line.split("\t");
	            if (parts.length >= 3) {
	                String companyName = parts[0];
	                double price = Double.parseDouble(parts[2].replace(",", ""));
	                data.put(companyName, price);
	            }
	        }
	        return data;
	    }

	    public static void main(String[] args) {
	        List<String> stockData = Arrays.asList(
	                "Flomic Global Logist\tX\t71.01\t71.05\t+ 0.06\tBuy  |  Sell",
	                "PSP Projects\tB\t642.00\t642.35\t+ 0.05\tBuy  |  Sell",
	                "Krishna Institute\tA\t1,829.25\t1,830.20\t+ 0.05\tBuy  |  Sell",
	                "Hindustan Aeronautic\tA\t4,975.35\t4,977.85\t+ 0.05\tBuy  |  Sell",
	                // Add more data lines here
	                "Astral Ltd\tA\t2,101.90\t2,102.00\t+ 0.00\tBuy  |  Sell"
	        );

	   //     StockDataProcessor processor = new AsyncProcessor();
	    //    processor.processStockData(stockData);
	    }
	}

	

