package com.company;
import io.quickchart.QuickChart;


public class Main{

    public static void main(String[] args) {
        createBarChart(10,20,30,40,50,60,70,"Viktor");
        createStackedBarChart(10,20,30,40,50,60,70,-10,-20,-30,-40,-50,-60,-70);
        createLineChart(10,20,30,40,50,60,70,"Viktor");
    }😄

    private static void createBarChart(int day1Commits, int day2Commits, int day3Commits, int day4Commits, int day5Commits, int day6Commits, int day7Commits, String memberName) {
        QuickChart chart = new QuickChart();
        chart.setWidth(500);
        chart.setHeight(300);
        chart.setConfig("{" +
                "  type: 'bar'," +
                "  data: {" +
                "    labels: ['Day 1', 'Day 2', 'Day 3', 'Day 4', 'Day 5', 'Day 6', 'Day 7']," +
                "    datasets: [" +
                "      {" +
                "        label: 'Commits'," +
                "        backgroundColor: 'rgba(255, 99, 132, 0.5)'," +
                "        borderColor: 'rgb(255, 99, 132)'," +
                "        borderWidth: 2," +
                "        data: ["+day1Commits+", "+day2Commits+", "+day3Commits+", "+day4Commits+", "+day5Commits+", "+day6Commits+", "+day7Commits+"]," +
                "      }" +
                "    ]," +
                "  }," +
                "  options: {" +
                "    title: {" +
                "      display: true," +
                "      text: 'Commits for "+memberName+"'," +
                "    }," +
                "    plugins: {" +
                "      datalabels: {" +
                "        anchor: 'center'," +
                "        align: 'center'," +
                "        color: '#666'," +
                "        font: {" +
                "          weight: 'normal'," +
                "        }," +
                "      }," +
                "    }," +
                "  }," +
                "}"
        );🟦U+1F7E6
        System.out.println("Bar chart: "+chart.getShortUrl());
    }

    
chart.setConfig("{" +
        "  type: 'bar'," +
        "  data: {" +
        "    labels: ['Day 1', 'Day 2', 'Day 3', 'Day 4', 'Day 5', 'Day 6', 'Day 7']," +
        "    datasets: [" +
        "      {" +
        "        label: 'Commits'," +
        "        backgroundColor: 'rgb(" + red + "," + green + "," + blue + ")'," +
            "        borderColor: 'rgb(" + (red+100>255 ? 255 : red+100) + "," +
            (green+100>255 ? 255 : green+100) + "," +
            (blue+100>255 ? 255 : blue+100) + ")'," +
            "        borderWidth: 2," +
            "        data: ["+day1Commits+", "+day2Commits+", "+day3Commits+", "+day4Commits+", "+day5Commits+", "+day6Commits+", "+day7Commits+"]," +
            "      }" +
            "    ]," +
            "  }," +
            "  options: {" +
            "    title: {" +
            "      display: true," +
            "      text: 'Commits for "+member.getMemberGithubName()+"'," +
            "    }," +
            "    plugins: {" +
            "      datalabels: {" +
            "        anchor: 'center'," +
            "        align: 'center'," +
            "        color: '#ffffff'," +
            "        font: {" +
            "          weight: 'normal'," +
            "        }," +
            "      }," +
            "    }," +
            "  }," +
            "}"
    private static void createStackedBarChart(int day1LinesAdded, int day2LinesAdded, int day3LinesAdded, int day4LinesAdded,
                                              int day5LinesAdded, int day6LinesAdded, int day7LinesAdded,
                                              int day1LinesRemoved, int day2LinesRemoved, int day3LinesRemoved,
                                              int day4LinesRemoved, int day5LinesRemoved, int day6LinesRemoved, int day7LinesRemoved ){
        QuickChart chart = new QuickChart();
        chart.setWidth(500);
        chart.setHeight(300);
        chart.setConfig("{" +
                "  type: 'bar'," +
                "  data: {" +
                "    labels: ['Day 1 ', 'Day 2', 'Day 3', 'Day 4', 'Day 5', 'Day 6', 'Day 7']," +
                "    datasets: [" +
                "           {" +
                "        label: 'Lines added'," +
                "        backgroundColor: 'rgb(0, 102, 204)'," +
                "        data: ["+day1LinesAdded+", "+day2LinesAdded+", "+day3LinesAdded+", "+day4LinesAdded+", "+day5LinesAdded+", "+day6LinesAdded+", "+day7LinesAdded+"]," +
                "      }," +
                "      {" +
                "        label: 'Lines removed'," +
                "        backgroundColor: 'rgb(255, 99, 132)'," +
                "          data: ["+day1LinesRemoved+", "+day2LinesRemoved+", "+day3LinesRemoved+", "+day4LinesRemoved+", "+day5LinesRemoved+", "+day6LinesRemoved+", "+day7LinesRemoved+"]," +
                "      }," +
                "    ]," +
                "  }," +
                "  options: {" +
                "    title: {" +
                "      display: true," +
                "    }," +
                "    scales: {" +
                "      xAxes: [" +
                "        {" +
                "          stacked: true," +
                "        }," +
                "      ]," +
                "      yAxes: [" +
                "        {" +
                "          stacked: true," +
                "        }," +
                "      ]," +
                "    }," +
                "  }," +
                "}"
        );
        System.out.println("Stacked bar chart: "+chart.getShortUrl());
    }
    private static void createLineChart(int day1Commits, int day2Commits, int day3Commits, int day4Commits, int day5Commits, int day6Commits, int day7Commits, String memberName) {
        QuickChart chart = new QuickChart();
        chart.setWidth(500);
        chart.setHeight(300);
        chart.setConfig("{" +
                "  type: 'line'," +
                "  data: {" +
                "    labels: ['Day 1', 'Day 2', 'Day 3', 'Day 4', 'Day 5', 'Day 6', 'Day 7']," +
                "    datasets: [" +
                "      {" +
                "        label: 'Commits'," +
                "        backgroundColor: 'rgb(255, 99, 132)'," +
                "        borderColor: 'rgb(255, 99, 132)'," +
                "        data: ["+day1Commits+", "+day2Commits+", "+day3Commits+", "+day4Commits+", "+day5Commits+", "+day6Commits+", "+day7Commits+"]," +
                "        fill: false," +
                "      }," +
                "    ]," +
                "  }," +
                "  options: {" +
                "    title: {" +
                "      display: true," +
                "      text: 'Chart.js Line Chart'," +
                "    }," +
                "  }," +
                "}"
        );
        System.out.println("Line chart: "+chart.getShortUrl());
    }
}
