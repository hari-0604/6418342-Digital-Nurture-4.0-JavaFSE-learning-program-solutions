# Git Merge Conflict Resolution Lab

This lab demonstrates how to resolve conflicts during a Git merge.

## Objectives
- Implement conflict resolution when multiple users update master and a branch differently.

## Steps
1. Verify master branch is clean: `git status`
2. Create branch:
   ```bash
   git checkout -b GitWork
   echo "<message>Hello from branch</message>" > hello.xml
   git add hello.xml
   git commit -m "Add hello.xml in GitWork branch"
   ```
3. Modify hello.xml in branch and commit.
4. Switch to master:
   ```bash
   git checkout master
   echo "<message>Hello from master</message>" > hello.xml
   git add hello.xml
   git commit -m "Add hello.xml in master branch"
   ```
5. View logs:
   ```bash
   git log --oneline --graph --decorate --all
   ```
6. Merge branch into master and resolve conflict using a 3-way merge tool.
7. Add `.gitignore` file to ignore backup files and commit changes.
8. Delete merged branch:
   ```bash
   git branch -d GitWork
   ```

## Tools Used
- Git
- Optional: P4Merge for visualization

---
Hands-on ID: Git-T03-HOL_001
