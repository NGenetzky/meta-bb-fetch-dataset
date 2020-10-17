HOMEPAGE = "https://github.com/skx/github2mr"
PV = "0.3.0"
PR = "r0"

inherit bb_fetcher
addtask do_unpack before do_build

SRCNAME = "github2mr-linux-amd64"
SRC_URI = "https://github.com/skx/github2mr/releases/download/v${PV}/${SRCNAME};name=amd64"
SRC_URI[amd64.md5sum] = "da350ff2ce8b4776dfb2ae8c8bcce60c"
SRC_URI[amd64.sha256sum] = "811752061fbd68889e9f5982de2c08aa9b66085a7c5959076e5c24ffe0e50329"

inherit install_bin_go
do_build(){
    install_bin_go_with_name "${WORKDIR}/${SRCNAME}" 'github2mr'
}
