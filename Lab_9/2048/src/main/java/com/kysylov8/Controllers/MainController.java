package com.kysylov8.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Random;
@Controller
public class MainController {
    private int size = 4;
    private boolean isWin, isDefault;
    private int[][] grid = {
            {0, 0, 2, 16},
            {2, 8, 0, 0},
            {0, 0, 2, 0},
            {0, 0, 16, 2}
    };

    private int[][] permission = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
    };

    void MoveCellsUp(){
        for (int x = 1; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (grid[x][y] != 0) {
                    int currentCellValue = grid[x][y];
                    int row = x - 1;

                    while (row >= 0 && grid[row][y] == 0) {
                        row--;
                    }
                    if (row >= 0 && grid[row][y] == currentCellValue && permission[row][y] == 0) {
                        permission[row][y] = 1;
                        grid[row][y] *= 2;
                        grid[x][y] = 0;
                    } else {
                        grid[row + 1][y] = currentCellValue;

                        if (row + 1 != x) {
                            grid[x][y] = 0;
                        }
                    }
                }
            }
        }

        CheckToWinDefault();
    }

    void MoveCellsDown(){
        for (int x = size - 2; x >= 0; x--) {
            for (int y = 0; y < size; y++) {
                if (grid[x][y] != 0) {
                    int currentCellValue = grid[x][y];
                    int row = x + 1;
                    while (row < size && grid[row][y] == 0) {
                        row++;
                    }
                    if (row < size && grid[row][y] == currentCellValue && permission[row][y] == 0) {
                        permission[row][y] = 1;
                        grid[row][y] *= 2;
                        grid[x][y] = 0;
                    } else {
                        grid[row - 1][y] = currentCellValue;
                        if (row - 1 != x) {
                            grid[x][y] = 0;
                        }
                    }
                }
            }
        }

        CheckToWinDefault();
    }

    void MoveCellsRight() {
        for (int x = 0; x < size; x++) {
            for (int y = 1; y < size; y++) {
                if (grid[x][y] != 0) {
                    int currentCellValue = grid[x][y];
                    int col = y - 1;
                    while (col >= 0 && grid[x][col] == 0) {
                        col--;
                    }
                    if (col >= 0 && grid[x][col] == currentCellValue && permission[x][col] == 0) {
                        permission[x][col] = 1;
                        grid[x][col] *= 2;
                        grid[x][y] = 0;
                    } else {
                        grid[x][col + 1] = currentCellValue;
                        if (col + 1 != y) {
                            grid[x][y] = 0;
                        }
                    }
                }
            }
        }

        CheckToWinDefault();
    }

    void MoveCellsLeft() {
        for (int x = 0; x < size; x++) {
            for (int y = size - 2; y >= 0; y--) {
                if (grid[x][y] != 0) {
                    int currentCellValue = grid[x][y];
                    int col = y + 1;
                    while (col < size && grid[x][col] == 0) {
                        col++;
                    }
                    if (col < size && grid[x][col] == currentCellValue && permission[x][col] == 0) {
                        permission[x][col] = 1;
                        grid[x][col] *= 2;
                        grid[x][y] = 0;
                    } else {
                        grid[x][col - 1] = currentCellValue;
                        if (col - 1 != y) {
                            grid[x][y] = 0;
                        }
                    }
                }
            }
        }

        CheckToWinDefault();
    }

    void CreateNewNumber(){
        Random random = new Random();

        boolean loop = true;

        while (loop){
            int randomX = random.nextInt(size);
            int randomY = random.nextInt(size);

            if (grid[randomX][randomY] == 0){
                grid[randomX][randomY] = 2;
                loop = false;
            }
        }
    }

    void CheckToWinDefault() {
        boolean spawnNumber = false;

        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                permission[x][y] = 0;

                if (grid[x][y] == 2048){
                    Win();
                }

                if (grid[x][y] == 0 && !isWin){
                    spawnNumber = true;
                }
            }
        }

        if (spawnNumber){
            CreateNewNumber();
        }
        else{
            Default();
        }
    }

    void ResetGame() {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                permission[x][y] = 0;
                grid[x][y] = 0;
            }
        }

        CreateNewNumber();
    }

    void Win() {
        //Win event
    }

    void Default(){
        //Defeat event
    }

    @GetMapping("/")
    public String drawGraphics(Model model) {
        ResetGame();

        model.addAttribute("array", grid);

        return "main";
    }

    @PostMapping("/MoveUp")
    public String moveUpButton(Model model){
        MoveCellsUp();

        model.addAttribute("array", grid);

        return "main";
    }

    @PostMapping("/MoveRight")
    public String moveRightButton(Model model){
        MoveCellsRight();

        model.addAttribute("array", grid);

        return "main";
    }

    @PostMapping("/MoveLeft")
    public String moveLeftButton(Model model){
        MoveCellsLeft();

        model.addAttribute("array", grid);

        return "main";
    }

    @PostMapping("/MoveDown")
    public String moveDownButton(Model model){
        MoveCellsDown();

        model.addAttribute("array", grid);

        return "main";
    }

    @PostMapping("/Restart")
    public String restartButton(Model model){
        ResetGame();

        model.addAttribute("array", grid);

        return "main";
    }
}
