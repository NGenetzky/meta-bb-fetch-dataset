#!/bin/bash
rsync -av './build/tmp/rootfs/' '/' "$@"
