# Git Cleanup and Push to Remote Lab

This lab demonstrates how to clean up a local Git repository and push changes to a remote.

## Objectives
- Verify repository state
- Synchronize with remote
- Push pending changes to remote

## Steps
1. Verify master branch is clean:
   ```bash
   git status
   ```

2. List all branches:
   ```bash
   git branch -a
   ```

3. Pull latest changes from remote into master:
   ```bash
   git checkout master
   git pull origin master
   ```

4. Push pending changes from "Git-T03-HOL_002":
   ```bash
   git push origin master
   ```

5. Verify changes are reflected in the remote repository via GitHub.

---
Hands-on ID: Git-T03-HOL_002
