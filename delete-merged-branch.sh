#!/bin/zsh
#
# Delete branches in the origin repository which is merged into master and next.

git fetch origin
git remote prune origin
base=`git merge-base origin/master origin/next`
branches=`git branch -r --merged $base | grep '^\s*origin/' | sed 's/^\s*origin\///' | grep -Ev '^(master|maint|next|pu|internal)$' | tr '\n' ' '`
if [ -n "$branches" ]
then
    echo Branches to be deleted:
    echo $branches | sed 's/ /\n/g' | sed 's/^/  /'
    # prevent unnecessary expansion
    eval "git push origin --delete $branches"
else
    echo No branch to be deleted
fi
