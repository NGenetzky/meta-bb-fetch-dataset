HOMEPAGE = "https://github.com/skx/github2mr"
PV = "1.10"
PR = "r0"

inherit bb_fetcher
addtask do_unpack before do_build

SRCNAME = "gosu-amd64"
SRC_URI = "https://github.com/tianon/gosu/releases/download/${PV}/${SRCNAME};name=amd64"
SRC_URI[amd64.sha256sum] = "5b3b03713a888cee84ecbf4582b21ac9fd46c3d935ff2d7ea25dd5055d302d3c"

inherit install_bin_go
do_build(){
    install_bin_go_with_name "${WORKDIR}/${SRCNAME}" 'gosu'
}
